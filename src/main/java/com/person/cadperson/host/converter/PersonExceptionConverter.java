package com.person.cadperson.host.converter;

public interface PersonExceptionConverter {

    Exception convert(final Exception exception, final Exception defaultException);
}
