package sqlgroupproject;

public class Employee {
	public static final String createTable =
			"CREATE TABLE Employee ("
			+ "Id  int not null primary key "
			+ "GENERATED ALWAYS AS IDENTITY "
			+ "(START WITH 100, INCREMENT BY 1),"
			+ "FirstName varchar(255),"
			+ "LastName varchar(255),"
			+ "JobTitle varchar(255),"
			+ "DOB varchar(255),"
			+ "StoreID int"
			+ ")";
	
	public static final String insertData =
			"INSERT INTO Employee (FirstName, LastName, JobTitle, DOB, StoreID) VALUES "
			+ "('Tom','Ballinger', 'Clerk', '03/16/03', 3),"
			+ "('Jessie','Romero', 'Manager', '07/21/97', 1),"
			+ "('Barry','Binkerhoff', 'Stocker', '01/05/02', 1)";
	
	public static final String selectAll =
			"SELECT * FROM Employee";
	
	public static final String dropTable =
			"DROP TABLE Employee";
	}
