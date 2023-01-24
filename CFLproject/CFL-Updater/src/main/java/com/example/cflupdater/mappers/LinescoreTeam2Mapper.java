//package com.example.cflupdater.mappers;
//
//import com.example.cflclient.cflclient.contract.LinescoreTeam2Dto;
//import com.example.cfldata.model.LinescoreTeam2;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LinescoreTeam2Mapper implements IMapEntities<LinescoreTeam2Dto, LinescoreTeam2> {
//
//    public LinescoreTeam2 map(LinescoreTeam2Dto linescoreTeam2Dto){
//        return map(linescoreTeam2Dto,new LinescoreTeam2());
//    }
//
//    @Override
//    public LinescoreTeam2 map(LinescoreTeam2Dto linescoreTeam2Dto, LinescoreTeam2 linescoreTeam2) {
//        linescoreTeam2.setQuarter(linescoreTeam2Dto.getQuarter());
//        linescoreTeam2.setScore(linescoreTeam2Dto.getScore());
//
//        return linescoreTeam2;
//    }
//
////    public LinescoreTeam2 map(LinescoreTeam2 linescoreTeam2, LinescoreTeam2Dto linescoreTeam2Dto) {
////        linescoreTeam2.setQuarter(linescoreTeam2Dto.getQuarter());
////        linescoreTeam2.setScore(linescoreTeam2Dto.getScore());
////
////        return linescoreTeam2;
////    }
//}
