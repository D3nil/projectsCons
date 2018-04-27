/**
 * 
 */
package model;

/**
 * @author Denilson
 */
public class Fornitori 
{
	private int id;
	private String company="";
	private String companyName_No_="";
	private String name="";
	private String name2="";
	private String address="";
	private String address2="";
	private String city="";
	private String postCode="";
	private String countryRegion_code="";
	private String e_mail="";
	private String phoneNo_="";
	private String FaxNo_="";
	private String vatRegistrationNo_="";
	private int blockedQualification=0;
	private int qualificationNotes=0;
	
	
	
	
	public Fornitori(int id, String company, String companyName_No_, String name, String name2, String address,
			String address2, String city, String postCode, String countryRegion_code, String e_mail, String phoneNo_,
			String faxNo_, String vatRegistrationNo_, int blockedQualification, int qualificationNotes) {
		this.id = id;
		this.company = company;
		this.companyName_No_ = companyName_No_;
		this.name = name;
		this.name2 = name2;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.postCode = postCode;
		this.countryRegion_code = countryRegion_code;
		this.e_mail = e_mail;
		this.phoneNo_ = phoneNo_;
		FaxNo_ = faxNo_;
		this.vatRegistrationNo_ = vatRegistrationNo_;
		this.blockedQualification = blockedQualification;
		this.qualificationNotes = qualificationNotes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyName_No_() {
		return companyName_No_;
	}
	public void setCompanyName_No_(String companyName_No_) {
		this.companyName_No_ = companyName_No_;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountryRegion_code() {
		return countryRegion_code;
	}
	public void setCountryRegion_code(String countryRegion_code) {
		this.countryRegion_code = countryRegion_code;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhoneNo_() {
		return phoneNo_;
	}
	public void setPhoneNo_(String phoneNo_) {
		this.phoneNo_ = phoneNo_;
	}
	public String getFaxNo_() {
		return FaxNo_;
	}
	public void setFaxNo_(String faxNo_) {
		FaxNo_ = faxNo_;
	}
	public String getVatRegistrationNo_() {
		return vatRegistrationNo_;
	}
	public void setVatRegistrationNo_(String vatRegistrationNo_) {
		this.vatRegistrationNo_ = vatRegistrationNo_;
	}
	public int getBlockedQualification() {
		return blockedQualification;
	}
	public void setBlockedQualification(int blockedQualification) {
		this.blockedQualification = blockedQualification;
	}
	public int getQualificationNotes() {
		return qualificationNotes;
	}
	public void setQualificationNotes(int qualificationNotes) {
		this.qualificationNotes = qualificationNotes;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuilder str = new StringBuilder();
	    str.append("id: "+getId()+"\n");
	    str.append("Company: "+getCompany()+"\n");
	    str.append("CompanyName_No_: "+getCompanyName_No_()+"\n");
	    str.append("Name: "+getName()+"\n");
	    str.append("Name2: "+getName2()+"\n");
	    str.append("Address: "+getAddress()+"\n");
	    str.append("Address2: "+getAddress2()+"\n");
	    str.append("City: "+getCity()+"\n");
	    str.append("PostCode: "+getPostCode()+"\n");
	    str.append("CountryRegion_code: "+getCountryRegion_code()+"\n");
	    str.append("E_mail: "+getE_mail()+"\n");
	    str.append("PhoneNo_: "+getPhoneNo_()+"\n");
	    str.append("FaxNo_: "+getFaxNo_()+"\n");
	    str.append("VatRegistrationNo_: "+getVatRegistrationNo_()+"\n");
	    str.append("BlockedQualification"+getBlockedQualification()+"\n");
	    str.append("QualificationNotes: "+getQualificationNotes()+"\n");    

	    return str.toString();
	}
	
	
	
	
}
