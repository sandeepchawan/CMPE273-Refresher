//passInfo is a JSON object
var passInfo = [
	{
		"name":"Raju",
		"age":35,
		"gender":"M",
		"seatNo":56
	},
	{
		"name":"Rinku",
		"age":32,
		"gender":"F",
		"seatNo":57	
	}
];

document.writeln("<table border = '1'><tr>");
document.writeln("<tr><th width=50><b>Name</b></th><th width=50><b>Age</b></th><th width=50><b>Gender</b></th><th width=50><b>SeatNo</b></th></tr>");	

var i = 0;     
for(i = 0;i<passInfo.length;i++){	
    document.writeln("<tr>");    
    document.writeln("<td width = 50>" + passInfo[i].name +"</td>");
    document.writeln("<td width = 50>" + passInfo[i].age +"</td>");
    document.writeln("<td width = 50>" + passInfo[i].gender +"</td>");
    document.writeln("<td width = 50>" + passInfo[i].seatNo +"</td>");       
    document.writeln("</tr>");
}
       			
document.writeln("</tr></table>");
