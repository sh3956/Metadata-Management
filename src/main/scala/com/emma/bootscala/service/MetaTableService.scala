package com.emma.bootscala.service

import com.emma.bootscala.domain.MetaTable
import com.emma.bootscala.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class MetaTableService @Autowired()(metaTableRepository:MetaTableRepository){

  @Transactional
  def save(metaTable:MetaTable) = {
      metaTableRepository.save(metaTable)
    }

  def query() = {
    metaTableRepository.findAll()
  }
}
