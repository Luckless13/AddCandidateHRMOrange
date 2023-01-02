Feature: Recruitment form

  Scenario: add candidate
  	When click menu recruitment
  	And click add
  	And isi first name 
  	And isi middle name 
  	And isi last name 
  #	And select vacancy
  	And isi email 
  	And isi contact number 
  	And isi keywords
  	And isi notes
  	And checklist data button
  	And Click simpan
  	Then add candidate success