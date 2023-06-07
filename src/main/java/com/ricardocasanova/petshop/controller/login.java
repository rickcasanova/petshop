package com.ricardocasanova.petshop.controller;

import java.util.Arrays;
import java.util.List;

import org.jose4j.jwa.AlgorithmConstraints.ConstraintType;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.ErrorCodes;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.lang.JoseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/login")
public class login {
	

	@GetMapping
	public void loginUser() throws JoseException, MalformedClaimException {
	    RsaJsonWebKey rsaJsonWebKey = RsaJwkGenerator.generateJwk(2048);
	    rsaJsonWebKey.setKeyId("k1");

	    JwtClaims claims = new JwtClaims();
	    claims.setIssuer("Issuer"); // who creates the token and signs it
	    claims.setAudience("Audience"); // to whom the token is intended to be sent
	    claims.setExpirationTimeMinutesInTheFuture(10); // time when the token will expire (10 minutes from now)
	    claims.setGeneratedJwtId(); // a unique identifier for the token
	    claims.setIssuedAtToNow();  // when the token was issued/created (now)
	    claims.setNotBeforeMinutesInThePast(2); // time before which the token is not yet valid (2 minutes ago)
	    claims.setSubject("subject"); // the subject/principal is whom the token is about
	    claims.setClaim("email","mail@example.com"); // additional claims/attributes about the subject can be added
	    List<String> groups = Arrays.asList("group-one", "other-group", "group-three");
	    claims.setStringListClaim("groups", groups); // multi-valued claims work too and will end up as a JSON array

	    JsonWebSignature jws = new JsonWebSignature();
	    jws.setPayload(claims.toJson());
	    jws.setKey(rsaJsonWebKey.getPrivateKey());
	    jws.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());
	    jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
	    String jwt = jws.getCompactSerialization();

	    System.out.println("JWT: " + jwt);

	    JwtConsumer jwtConsumer = new JwtConsumerBuilder()
	            .setRequireExpirationTime() // the JWT must have an expiration time
	            .setAllowedClockSkewInSeconds(30) // allow some leeway in validating time based claims to account for clock skew
	            .setRequireSubject() // the JWT must have a subject claim
	            .setExpectedIssuer("Issuer") // whom the JWT needs to have been issued by
	            .setExpectedAudience("Audience") // to whom the JWT is intended for
	            .setVerificationKey(rsaJsonWebKey.getKey()) // verify the signature with the public key
	            .setJwsAlgorithmConstraints( // only allow the expected signature algorithm(s) in the given context
	                    ConstraintType.PERMIT, AlgorithmIdentifiers.RSA_USING_SHA256) // which is only RS256 here
	            .build(); // create the JwtConsumer instance

	    try
	    {
	        JwtClaims jwtClaims = jwtConsumer.processToClaims(jwt);
	        System.out.println("JWT validation succeeded! " + jwtClaims);
	    }
	    catch (InvalidJwtException e)
	    {
	        System.out.println("Invalid JWT! " + e);

	        if (e.hasExpired())
	        {
	            System.out.println("JWT expired at " + e.getJwtContext().getJwtClaims().getExpirationTime());
	        }

	        if (e.hasErrorCode(ErrorCodes.AUDIENCE_INVALID))
	        {
	            System.out.println("JWT had wrong audience: " + e.getJwtContext().getJwtClaims().getAudience());
	        }
	    }
	}	
}
