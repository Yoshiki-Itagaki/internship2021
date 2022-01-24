'use strict'

$(function(){
	//マウスが載ったらサブメニュー表示
	$("ul.menu li").mouseenter(function(){
		$(this).siblings().find("ul").hide(100)
		$(this).children().slideDown(250);
	});
	//どこかがくりっくされたらサブメニュー消去
	$('html').click(function(){
		$('ul.menu ul').slideUp(150);
	});
})


  $(".pic").slick({
    autoplay: true, // 自動再生を設定
    autoplaySpeed: 4000, // 自動再生のスピード（ミリ秒単位）
	slidesToShow: 1,
	fade:true
  });

