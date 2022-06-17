package com.example.weektest.service;

import com.example.weektest.dto.RequestCreateMemberDTO;
import com.example.weektest.dto.RequestUpdateMemberDTO;
import com.example.weektest.dto.ResponseMemberDTO;

import java.util.List;

public interface MemberService {
    long saveMember(RequestCreateMemberDTO requestCreateMemberDTO);
    ResponseMemberDTO findMember(Long id);
    long removeMember(Long id);
    long modifyMember(Long id, RequestUpdateMemberDTO requestUpdateMemberDTO);
    List<ResponseMemberDTO> recommendMember(Long id);
}