package com.example.film.festival.management.mapper;

import com.example.film.festival.management.dao.entity.FilmEntity;
import com.example.film.festival.management.model.response.FilmResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FilmMapper {
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    List<FilmResponse> buildFilmResponses(List<FilmEntity> filmEntities);
}
