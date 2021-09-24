package com.emma.bootscala.repository

import com.emma.bootscala.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{

}
