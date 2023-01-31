package com.example.cflwebapi.webapi.mappers;

public interface IMap <TEntity,TDto>{
    TDto map(TEntity tEntity);
    TDto map(TEntity tEntity,TDto tDto);
}
