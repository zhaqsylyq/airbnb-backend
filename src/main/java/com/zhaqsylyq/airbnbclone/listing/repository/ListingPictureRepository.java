package com.zhaqsylyq.airbnbclone.listing.repository;

import com.zhaqsylyq.airbnbclone.listing.domain.ListingPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {
}
