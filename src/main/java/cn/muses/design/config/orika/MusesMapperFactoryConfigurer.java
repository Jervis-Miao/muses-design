package cn.muses.design.config.orika;

import cn.muses.design.config.orika.converter.FileStreamConverter;
import cn.muses.design.config.orika.converter.MapConverter;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;

/**
 * @author jervis
 * @date 2020/12/1.
 */
public class MusesMapperFactoryConfigurer extends AbstractOrikaMapperFactoryConfigurer {

    @Override
    protected void addConverter(ConverterFactory converterFactory) {
        converterFactory.registerConverter("mapConverter", new MapConverter<>());
        converterFactory.registerConverter("fileStreamConverter", new FileStreamConverter());
    }

    @Override
    protected void addFluidMapper(MapperFactory mapperFactory) {}
}
