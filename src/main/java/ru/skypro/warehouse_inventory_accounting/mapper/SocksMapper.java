package ru.skypro.warehouse_inventory_accounting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import ru.skypro.warehouse_inventory_accounting.dto.IncomeOrOutcomeSocks;
import ru.skypro.warehouse_inventory_accounting.entity.Socks;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SocksMapper {

    Socks incomeOrOutcomeSocksToSocks(IncomeOrOutcomeSocks incomeOrOutcomeSocks);

}
