//package com.example.cflupdater.mappers;
//
//import com.example.cflclient.cflclient.contract.LinescoreTeam1Dto;
//import com.example.cfldata.model.LinescoreTeam1;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LinescoreTeam1Mapper implements IMapEntities<LinescoreTeam1Dto,LinescoreTeam1> {
//
//    public LinescoreTeam1 map(LinescoreTeam1Dto linescoreTeam1Dto){
//        return map(linescoreTeam1Dto,new LinescoreTeam1());
//    }
//
//    @Override
//    public LinescoreTeam1 map(LinescoreTeam1Dto linescoreTeam1Dto, LinescoreTeam1 linescoreTeam1) {
//        linescoreTeam1.setQuarter(linescoreTeam1Dto.getQuarter());
//        linescoreTeam1.setScore(linescoreTeam1Dto.getScore());
//
//        return linescoreTeam1;
//    }
//
////    public LinescoreTeam1 map(LinescoreTeam1 linescoreTeam1, LinescoreTeam1Dto linescoreTeam1Dto) {
////        linescoreTeam1.setQuarter(linescoreTeam1Dto.getQuarter());
////        linescoreTeam1.setScore(linescoreTeam1Dto.getScore());
////
////        return linescoreTeam1;
////    }
//}
