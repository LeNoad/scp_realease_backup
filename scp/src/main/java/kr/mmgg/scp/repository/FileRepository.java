package kr.mmgg.scp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.mmgg.scp.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Long>{
	
}
