var app = app || {};
app = {
	init : x =>{
		var head = document.createElement( 'head' );
		var body = document.createElement( 'body' );
		document.documentElement.appendChild(head);
		document.documentElement.appendChild(body);              //바디,헤드 만들어짐
		$('<div id="wrapper"></div>').appendTo('body');
		$('<div id="container" class="container"></div>').appendTo('#wrapper');   //load 값 호출 없는 화면만
		if(x.result==='true'){
			alert('보기:/exist');
			$('#container')
			.load(x.context+'/exist') 
			}else{
				$('#container')
				.load(x.context+'/not-exist') 
			}
/*	},
	home : x =>{
		return '<div id="'+id+'"><h1 id="result"></h1></div>';*/
	}
};

/*dom.documentElement.innerHTML = '<head></head><body></body>';
Or go with the more rigorous:

var head = dom.createElement( 'head' );
var body = dom.createElement( 'body' );
dom.documentElement.appendChild(head);
dom.documentElement.appendChild(body);
*/
//load는 주로 광고에서 사용