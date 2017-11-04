package com.chapter1.lesson5;

public class NC {

	public NC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public NC.NC1 getNc1() {
		return nc1;
	}

	public void setNc1(NC.NC1 nc1) {
		this.nc1 = nc1;
	}

	protected class NC1 {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		protected class NC2 {
			private String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			protected class NC3 {
				private String name;

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				protected class NC4 {
					protected class NC5 {
						protected class NC6 {
							protected class NC7 {
								protected class NC8 {
									protected class NC9 {
										protected class NC10 {
											private String name;

											public String getName() {
												return name;
											}

											public void setName(String name) {
												this.name = name;
											}

											public NC10() {
												// TODO Auto-generated
												// constructor stub
											}
										}

										private String name;

										public String getName() {
											return name;
										}

										public void setName(String name) {
											this.name = name;
										}

										public NC9() {
											// TODO Auto-generated constructor
											// stub
										}
									}

									private String name;

									public String getName() {
										return name;
									}

									public void setName(String name) {
										this.name = name;
									}

									public NC8() {
										// TODO Auto-generated constructor stub
									}
								}

								private String name;

								public String getName() {
									return name;
								}

								public void setName(String name) {
									this.name = name;
								}

								public NC7() {
									// TODO Auto-generated constructor stub
								}
							}

							private String name;

							public String getName() {
								return name;
							}

							public void setName(String name) {
								this.name = name;
							}

							public NC6() {
								// TODO Auto-generated constructor stub
							}
						}

						private String name;

						public String getName() {
							return name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public NC5() {
							// TODO Auto-generated constructor stub
						}
					}

					private String name;

					public String getName() {
						return name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public NC4() {
						// TODO Auto-generated constructor stub
					}
				}

				public NC3() {
					// TODO Auto-generated constructor stub
				}
			}

			public NC2() {
				// TODO Auto-generated constructor stub
			}
		}

		public NC1() {
			// TODO Auto-generated constructor stub
		}
	}

	private NC.NC1 nc1 = new NC.NC1();
	private NC.NC1.NC2 nc2 = nc1.new NC2();
	private NC.NC1.NC2.NC3 nc3 = nc2.new NC3();
	private NC.NC1.NC2.NC3.NC4 nc4 = nc3.new NC4();
	private NC.NC1.NC2.NC3.NC4.NC5 nc5 = nc4.new NC5();
	private NC.NC1.NC2.NC3.NC4.NC5.NC6 nc6 = nc5.new NC6();
	private NC.NC1.NC2.NC3.NC4.NC5.NC6.NC7 nc7 = nc6.new NC7();
	private NC.NC1.NC2.NC3.NC4.NC5.NC6.NC7.NC8 nc8 = nc7.new NC8();
	private NC.NC1.NC2.NC3.NC4.NC5.NC6.NC7.NC8.NC9 nc9 = nc8.new NC9();
	private NC.NC1.NC2.NC3.NC4.NC5.NC6.NC7.NC8.NC9.NC10 nc10 = nc9.new NC10();

	public void foo() {
		nc1.setName("NC1");
		nc2.setName("NC2");
		nc3.setName("NC3");
		nc4.setName("NC4");
		nc5.setName("NC5");
		nc6.setName("NC6");
		nc7.setName("NC7");
		nc8.setName("NC8");
		nc9.setName("NC9");
		nc10.setName("NC10");

	}

}
