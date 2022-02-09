package com.cognixia.jump.bridgeCourse.classes;

public class Collar {
		private int id;
		private String address;

		Collar(int id, String address) {
				this.id = id;
				this.address = address;
		}

		public String getAddress() {
				return address;
		}

		public void setAddress(String address) {
				this.address = address;
		}

		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		@Override
		public String toString() {
				return "Collar [id=" + id + ", address=" + address + "]";
		}

}
