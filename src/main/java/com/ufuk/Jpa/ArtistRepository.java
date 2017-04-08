package com.ufuk.Jpa;

import com.ufuk.Jpa.entitiy.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface artist related database operations.
 */
public interface ArtistRepository extends JpaRepository<ArtistEntity, String>
{

}
