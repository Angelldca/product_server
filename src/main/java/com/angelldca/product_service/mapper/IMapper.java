package com.angelldca.product_service.mapper;

public interface IMapper<in, out> {
    out map(in i);
}
