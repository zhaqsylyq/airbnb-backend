package com.zhaqsylyq.airbnbclone.booking.mapper;

import com.zhaqsylyq.airbnbclone.booking.application.dto.BookedDateDTO;
import com.zhaqsylyq.airbnbclone.booking.application.dto.NewBookingDTO;
import com.zhaqsylyq.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
