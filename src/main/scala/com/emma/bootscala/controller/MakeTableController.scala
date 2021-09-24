package com.emma.bootscala.controller

import com.emma.bootscala.domain.MetaTable
import com.emma.bootscala.service.MetaTableService
import com.emma.bootscala.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestMapping, RequestMethod, ResponseBody, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MakeTableController @Autowired()(metaTableService: MetaTableService){

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable:MetaTable) = {
      metaTableService.save(metaTable)
      ResultVOUtil.success()
  }

  @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
  @ResponseBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }
}
