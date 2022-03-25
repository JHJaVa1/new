package kr.co.hjsoft.service;

import kr.co.hjsoft.dto.BoardDTO;
import kr.co.hjsoft.dto.MemberDTO;
import kr.co.hjsoft.entity.Member;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public interface MemberService {


    //데이터 수정을 위한 메소드
    void modify(MemberDTO memberdto);
    //데이터 삭제를 위한 메소드
    void delete(String memberEMAIL);

    //사용자 정보 가져오는 메소드
    MemberDTO getmember(String memberEMAIL);


//    //Member Entity를 ReplyDTO로 변환해주는 메서드
    default MemberDTO entityToDTO(Member member){
        MemberDTO memberdto = MemberDTO.builder()
                .memberADDRESS(member.getMemberADDRESS())
                .memberEMAIL(member.getMemberEMAIL())
                .memberGENDER(member.getMemberGENDER())
                .memberNAME(member.getMemberNAME())
                .memberNICKNAME(member.getMemberNICKNAME())
                .memberPHONE(member.getMemberPHONE())
                .memberPW(member.getMemberPW())
                .build();
        return memberdto;
    }
}
