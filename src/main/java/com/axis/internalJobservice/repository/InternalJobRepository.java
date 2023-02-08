package com.axis.internalJobservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.internalJobservice.entity.InternalJob;
@Repository
public interface InternalJobRepository extends JpaRepository<InternalJob, Integer>{

}
