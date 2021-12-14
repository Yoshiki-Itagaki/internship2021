//課題１
	'use strict';


	let element = document.getElementById('star');
	let starBlack = ' ★ ';
	for (let i = 0; i < 5; i++){
		element.insertAdjacentHTML('beforeend', starBlack);
	}



//課題２ RowA

/* 奇数列のループと偶数列のループそれぞれを
 変数のように（？）扱いつつ、forループ内で
 奇数と偶数それぞれの列を5回並べるという処理にしたかったが
 上手くいかなかった。
 
 */

	'use strict';

	element = document.getElementById('row1');
	let starWhite = '☆';
	
	for (let i = 0; i < 5; i++){
		for (let j = 0; j < 1; j++){
			if ((i+j) % 2 != 0) 
					element.insertAdjacentHTML('beforeend', starBlack);				
			else 
				element.insertAdjacentHTML('beforeend', starWhite);
			
		}
	
	}	
		

//課題２ Row2

	'use strict';

	element = document.getElementById('row2');
	
	for (let i = 0; i < 5; i++){
		for (let j = 0; j < 1; j++){
			if ((i+j) % 2 != 0) 
					element.insertAdjacentHTML('beforeend', starWhite);				
			else 
				element.insertAdjacentHTML('beforeend', starBlack);
			
		}
	
	}	
		

//課題２ Row3

	'use strict';

	element = document.getElementById('row3');
	
	for (let i = 0; i < 5; i++){
		for (let j = 0; j < 1; j++){
			if ((i+j) % 2 != 0) 
					element.insertAdjacentHTML('beforeend', starBlack);				
			else 
				element.insertAdjacentHTML('beforeend', starWhite);
			
		}
	
	}	
		


//課題２ Row4

	'use strict';

	element = document.getElementById('row4');
	
	for (let i = 0; i < 5; i++){
		for (let j = 0; j < 1; j++){
			if ((i+j) % 2 != 0) 
					element.insertAdjacentHTML('beforeend', starWhite);				
			else 
				element.insertAdjacentHTML('beforeend', starBlack);
			
		}
	
	}	
	
//課題２ Row5

	'use strict';

	element = document.getElementById('row5');
	
	for (let i = 0; i < 5; i++){
		for (let j = 0; j < 1; j++){
			if ((i+j) % 2 != 0) 
					element.insertAdjacentHTML('beforeend', starBlack);				
			else 
				element.insertAdjacentHTML('beforeend', starWhite);
			
		}
	
	}
	
//課題２　終了	

//課題3

'use strict'
	
document.getElementById('form').onsubmit=function(event){
	//計算を処理する関数
	event.preventDefault();
	const search = document.getElementById('form').word.value;
	
	let money = search;
	let price;
	let change;	
	let element = document.getElementById('drink').value;
	


	if (element == 'コーヒー'){
		price = 150;
		change = money - price;	
		
		if (change >= 0) {
			document.getElementById('output').textContent = element + 'を購入しました。おつりは' + change + '円です';
			}		
		else 
			document.getElementById('output').textContent = '金額が足りないので購入できません';
	}
	
	else if (element == 'お茶'){
		price = 130;
		change = money - price;	
		
		if (change >= 0) {
			document.getElementById('output').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else 
			document.getElementById('output').textContent = '金額が足りないので購入できません';
	
	}	
	else if (element == 'オレンジジュース'){
		price = 160;
		change = money - price;	
		
		if (change >= 0) {
			document.getElementById('output').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else 
			document.getElementById('output').textContent = '金額が足りないので購入できません';
	}
	
	else if (element == '水'){
		price = 100;
		change = money - price;	
		
		if (change >= 0) {
			document.getElementById('output').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else 
			document.getElementById('output').textContent = '金額が足りないので購入できません';
	}
};
//課題3終了


//発展

'use strict'
	
function func1(){
	
	//入力金額に応じて、以下のように参照するCSSファイルを切り替える
	const money = document.getElementById('form2').word.value;

	if (money < 100){
		document.getElementById('css').href = 'index-layout (2).css';
	}
	
	else if (money >= 100 && money < 130){
		document.getElementById('css').href = 'index-layout (3).css';
	}
	
	else if (money >= 130 && money < 150){
		document.getElementById('css').href = 'index-layout (4).css';
	}
	
	else if(money >= 150 && money < 160){
		document.getElementById('css').href = 'index-layout (5).css';
	}
	else 
		document.getElementById('css').href = 'index-layout (6).css';
}


document.getElementById('form2').onsubmit=function(event){
	//計算を処理する関数。課題3とほぼ同じ
	
	event.preventDefault();
	const search = document.getElementById('form2').word.value;	
	let money = search;
	let price;
	let change;
	let beverage;
	let element;
	let checkbox1 = document.getElementById('check1');
	let checkbox2 = document.getElementById('check2');
	let checkbox3 = document.getElementById('check3');
	let checkbox4 = document.getElementById('check4');	
		
	if (checkbox1.checked){
		price = 150;
		change = money - price;	
		element = document.getElementById('check1').value;

		if (change >= 0) {
			document.getElementById('comment').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else document.getElementById('comment').textContent = '金額が足りないので購入できません';
	}
	
	else if (checkbox2.checked){
		price = 130;
		change = money - price;	
		element = document.getElementById('check2').value;

		if (change >= 0) {
			document.getElementById('comment').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else document.getElementById('comment').textContent = '金額が足りないので購入できません';
	}
	
	else if (checkbox3.checked){
		price = 160;
		change = money - price;	
		element = document.getElementById('check3').value;

		if (change >= 0) {
			document.getElementById('comment').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else document.getElementById('comment').textContent = '金額が足りないので購入できません';
	}
	
	else if (checkbox4.checked){
		price = 100;
		change = money - price;	
		element = document.getElementById('check4').value;

		if (change >= 0) {
			document.getElementById('comment').textContent = element + 'を購入しました。おつりは' + change + '円です';
		}		
		else document.getElementById('comment').textContent = '金額が足りないので購入できません';
	}
};
	