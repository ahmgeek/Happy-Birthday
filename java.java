 /**
* Today, the 14th day of May, is your birthday.
* So I created shamelessly hacked this page to celebrate this extraordinary day.
*/
God u = new God("Abdullah Al.Nady");
// May 14th, when the bell rang, your age increased
Date currentTime = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String dateString = formatter.format(currentTime);
if( dateString.equals("2013-08-13 00:00:00") ){
u.age ++;
}
// Our blessing will be with you simultaneously.
new Thread (){
@Override
// Forever and ever. I wish
while(true){
// luckiness,
u.fortune ++;
// happiness,
u.happiness ++;
// and everything you wish can be achieved.
}.start()
// The last thing I wanna say, boring and ordinary, is:
System.out.println("Happy Birthday !"); 
