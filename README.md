# Experian BusinessInformation API - Java Library

The Experian Java library provides convenient access to the RESTful Experian BIS APIs from Applications written in Java.
This package is for use with Java Application (Core Java/ J2EE or any similar Java Enabled Platform like Android) that uses Experian client_id, client_secret, username, password and subcode (if applicable).

## Documentation

For Detailed documentation of Experian APIs, visit [Experian Developers Portal](http://developer.experian.com/)

## Java Library Workspace Setup & Development

### Prerequisites

 1. JDK 1.8
 2. Eclipse Mars or newer version
 3. Maven 2+ (or Eclipse Embedded
 4. Git Client (e.g Git Bash)

### Authentication before Calling the API


	System.setProperty("javax.net.useSystemProxies", "false");
	Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("hostname", port));
	BISAuthenticationService authService = new BISAuthenticationService(proxy);
	BISServiceCredential serviceCredential = authService.getStageServiceCredential("username", "password", "clientId", "clientSecret");
		
### BIS Business Services

##### Bankruptcies
	{		
		BankruptcyService service = new BankruptcyService(serviceCredential, proxy);
		BankruptcyServiceRequest request = new BankruptcyServiceRequest();
		
		request.setBankruptcyDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}	

##### Business Facts
	{
		BusinessFactsService service = new BusinessFactsService(serviceCredential, proxy);
		BusinessFactsServiceRequest request = new BusinessFactsServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Collections
	{	
		CollectionsService service = new CollectionsService(serviceCredential, proxy);
		CollectionsServiceRequest request = new CollectionsServiceRequest();
		
		request.setCollectionsSummary(true);
		request.setCollectionsDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Corporate Linkage
	{
		CorporateLinkageService service = new CorporateLinkageService(serviceCredential, proxy);
		CorporateLinkageServiceRequest request = new CorporateLinkageServiceRequest();
		
		request.setCorporateLinkagePartial(true);
		request.setCorporateLinkageFull(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Corporate Registrations
	{
		CorporateRegistrationsService service = new CorporateRegistrationsService(serviceCredential, proxy);
		CorporateRegistrationsServiceRequest request = new CorporateRegistrationsServiceRequest();
		
		request.setStatusDescriptionDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}	

##### Credit Status
	{
		CreditStatusService service = new CreditStatusService(serviceCredential, proxy);
		CreditStatusServiceRequest request = new CreditStatusServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Fraud Shields
	{
		FraudShieldsService service = new FraudShieldsService(serviceCredential, proxy);
		FraudShieldsServiceRequest request = new FraudShieldsServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

#### Headers
	{
		HeadersService service = new HeadersService(serviceCredential, proxy);
		HeadersServiceRequest request = new HeadersServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Judgements
	{
		JudgmentsService service = new JudgmentsService(serviceCredential, proxy);
		JudgmentsServiceRequest request = new JudgmentsServiceRequest();

		request.setJudgmentSummary(true);
		request.setJudgmentDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Legal Collection Summaries
	{
		LegalCollectionsSummariesService service = new LegalCollectionsSummariesService(serviceCredential, proxy);
		LegalCollectionsSummariesServiceRequest request = new LegalCollectionsSummariesServiceRequest();

		request.setLegalFilingsCollectionsSummary(true);
		request.setLegalFilingsSummary(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Liens
	{
		LiensService service = new LiensService(serviceCredential, proxy);
		LiensServiceRequest request = new LiensServiceRequest();

		request.setLienSummary(true);
		request.setLienDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Risk Dashboards
	{
		RiskDashboardsService service = new RiskDashboardsService(serviceCredential, proxy);
		RiskDashboardsServiceRequest request = new RiskDashboardsServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Scores
	{
		ScoresService service = new ScoresService(serviceCredential, proxy);
		ScoresServiceRequest request = new ScoresServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
		request.setModelCode("000224");
		request.setCommercialScore(true);
		request.setFsrScore(true);
	}	

##### Trades
	{
		TradesService service = new TradesService(serviceCredential, proxy);
		TradesServiceRequest request = new TradesServiceRequest();

		request.setTradePaymentSummary(true);
		request.setTradePaymentTotals(false);
		request.setTradePaymentExperiences(false);
		request.setTradePaymentTrends(false);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### UCC Filings
	{
		UCCFilingsService service = new UCCFilingsService(serviceCredential, proxy);
		UCCFilingsServiceRequest request = new UCCFilingsServiceRequest();

		request.setUccFilingsSummary(true);
		request.setUccFilingsDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Reverse Addresses	
	{
		ReverseAddressesService service = new ReverseAddressesService(serviceCredential, proxy);
		ReverseAddressesServiceRequest request = new ReverseAddressesServiceRequest();
		
		request.setSubcode("0517614");
		request.setStreet("475 ANTON BLVD");
		request.setCity("Costa Mesa");
		request.setState("CA");
		request.setZip("92626");
	}

##### Reverse Phones
	{
		ReversePhonesService service = new ReversePhonesService(serviceCredential, proxy);
		ReversePhonesServiceRequest request = new ReversePhonesServiceRequest();
		
		request.setSubcode("0517614");
		request.setPhone("8008888888");
	}

##### Reverse TaxIDs
	{
		ReverseTaxIDsService service = new ReverseTaxIDsService(serviceCredential, proxy);
		ReverseTaxIDsServiceRequest request = new ReverseTaxIDsServiceRequest();
		
		request.setSubcode("0517614");
		request.setTaxId("222152871");
	}

##### Business Contacts	
	{
		BusinessContactsService service = new BusinessContactsService(serviceCredential, proxy);
		BusinessContactsServiceRequest request = new BusinessContactsServiceRequest();
		
		request.setBin("807205801");
		request.setSubcode("0517614");
	}

##### Scores/Search	
	{
		ScoresSearchService service = new ScoresSearchService(serviceCredential, proxy);
		ScoresSearchServiceRequest request = new ScoresSearchServiceRequest();
		
		request.setName("EXPERIAN");
		request.setCity("Costa Mesa");
		request.setState("CA");
		request.setSubcode("0517614");
		request.setZip("92626");
		request.setGeo(true);
		request.setMatchReliabilityCode(83);
		request.setCommercialScore(true);
		request.setFsrScore(true);
	}

### BIS Social Media Insights Services

#### SMI Attributes
```java
public SocialMediaAttributesResponse getSMIAttributesSampleResponse(){
	SocialMediaAttributesService service = new SocialMediaAttributesService(serviceCredential, proxy);
	SocialMediaAttributesRequest request = new SocialMediaAttributesRequest();
	request.setName("Apple");
	request.setStreet("1 Infinite");
	request.setCity("Cupertino");
	request.setState("CA");
	request.setSubcode("0563736");
	SocialMediaAttributesResponse response = null;
	try {
		@SuppressWarnings("unused")
		response = (SocialMediaAttributesResponse) service.execute(request);
	}
	catch(BISValidationException vex) {
		//Custom validation for invalid data
		System.out.println((new ObjectMapper()).writeValueAsString(vex.getServiceError()));
	}
	catch(BISServiceException ex) {
		//Custom validation for service error
		System.out.println((new ObjectMapper()).writeValueAsString(ex.getServiceError()));
	}
	return response;
}
```

### An example `response` object

{
    "requestId": "XXXX-XXXX-XXXX-XXXX",
    "success": true,
    "results": [...]
}

#### `error` object
{
    "success": false,
    "requestId": "XXXX-XXXX-XXXX-XXXX",
    "errors": [
        {
            "errorCode": XXXX,
            "errorType": "Error Type",
            "message": "Error Message"
        }
    ]
}
