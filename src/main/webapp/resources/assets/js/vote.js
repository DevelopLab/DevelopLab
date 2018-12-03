function voteSubmit(number) {
	if($("#user_name_field").val() == "") {
		alert("投票者の名前を入力してください");
		return;
	}
	$("#vote_number").val(number);
	$("#user_name").val($("#user_name_field").val());
	$("#user_agent").val(navigator.userAgent);
	$("#vote_submit").submit();
};

function voteResultSubmit() {
	$("#vote_result_submit").submit();
};