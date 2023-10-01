package sqlgroupproject;

public class Store {
	public static final String createTable =
			"CREATE TABLE Store ("
			+ "Id int,"
			+ "City varchar(255),"
			+ "Pharmacy int,"
			+ "Zipcode int"
			+ ")";
	
	public static final String insertData =
			"INSERT INTO Store (Id, City, Pharmacy, Zipcode) VALUES "
			+ "(1000,'Taylorsville', 0, 84045),"
			+ "(1001,'Detroit', 1, 48127),"
			+ "(1002,'Arlington', 0, 76001)";
	
	public static final String selectAll =
			"SELECT * FROM Store";
	
	public static final String dropTable =
			"DROP TABLE Store";
	
}