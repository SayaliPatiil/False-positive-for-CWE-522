public class InsufficientlyProtectedCredentials {
public void method1() {
Properties prop = new Properties();
prop.load(new FileInputStream("config.properties"));
String password = prop.getProperty("password");
//EMB-ISSUE: CodeIssueNames.INSUFFICIENTLY_PROTECTED_CREDENTIALS
DriverManager.getConnection(url, usr, password);
}}
