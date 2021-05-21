package GameDemo.entities;

import java.time.LocalDate;

public class Gamer {

	
		
		private int id;
		private String FirstName;
		private String LastName;
		private String NationalityId;
		private LocalDate dateOfBirth;
		
		

		public Gamer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
			super();
			this.id = id;
			FirstName = firstName;
			LastName = lastName;
			NationalityId = nationalityId;
			this.dateOfBirth = dateOfBirth;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getNationalityId() {
			return NationalityId;
		}

		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		

	

        }
		
		
}		
