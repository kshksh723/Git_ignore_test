package nocommit_some;

public class NoCommit_3 {

	public static void main(String[] args) {
	/*
		NoCommit_3.java 파일을 생성하기 이전부터
		.gitignore 파일속에 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_3.java 이라고 특정파일을 등록해 둔 상태 입니다. 
	*/	
		System.out.println("## NoCommit_3.java 파일입니다. ##");
	/*
		NoCommit_3.java 파일은 내용에 변경을 하고 저장하더라도 ignore 대상 파일이므로 
		Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계)에 등록이 되지 않으므로
		Commit 대상에서 빠지게 됩니다. 
		그러므로 이파일은 Push 대상에서도 빠지게 됩니다.
	*/	
	}

}
