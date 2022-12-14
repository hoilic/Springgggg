$(function(){
	$('#updateDiv').hide();

	//아이디 찾기
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();

		$.ajax({
			type:'post',
			url:'/chapter06_SpringWebMaven/user/getUser',
			data:'id=' + $('#searchId').val(),
			//dataType: 'json',
			/*서버에서 받아오는 데이터 타입은 'text', 'html', 'xml', 'json' 형식을 지정할 수 있다
			 getUser에서 id를 찾으면 제대로 JSON으로 오지만
			 			id가 없으면 JSON으로 오지르 ㄹ못한다.
			그래서 dataType를 생략해야 한다. (dataType를 생략하면 자료에 맞게 자동으로 형식이 지정된다.)
			 */
			success: function(data){
				//alert(JSON.stringify(data));

				if(data == '') {
					$('#resultDiv').text('찾고자 하는 아이디가 없습니다');
					$('#resultDiv').css('color', 'red');
					$('#resultDiv').css('font-weight', 'red');
				}
				else {
					$('#updateDiv').show();

					$('#name').val(data.name);
					$('#id').val(data.id);
				}

			},
			error: function(err){
				console.log(err);
			}
		});//$.ajax
	});
});

//취소버튼
$('#resetBtn').click(function(){
	$('#searchIdBtn').triger('click');//강제 이벤트 발생
});
$('#updateBtn').click(function(){
	$('#nameDiv').empty();
	$('#pwdDiv').empty();
	
	if($('#name').val() == ''){
		$('#nameDiv').text('이름을 입력하세요');
		$('#name').focus();
		
	}else if($('#id').val() == ''){
		$('#idDiv').text('아이디를 입력하세요');
		$('#id').focus();
	}else{
	$.ajax({
		type: 'post',
		url: '/chapter06_SpringWebMaven/user/update',
		data: $('#updateForm').serialize(),
		success: function(){
			alert("회원님의 정보를 수정했습니다.");
			location.href='/chapter06_SpringWebMaven/user/list';
		},
		error:function(err){
			console.log(err);
		}
	});//강제 이벤트 발생
	}
});