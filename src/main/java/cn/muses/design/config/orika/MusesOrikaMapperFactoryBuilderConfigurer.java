/**
 * Copyright 2022 XYZ Co., Ltd. All Rights Reserved
 */
package cn.muses.design.config.orika;

import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.impl.UtilityResolver;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryBuilderConfigurer;

/**
 * @author jervis
 * @date 2022/7/12.
 */
public class MusesOrikaMapperFactoryBuilderConfigurer implements OrikaMapperFactoryBuilderConfigurer {

    @Override
    public void configure(DefaultMapperFactory.MapperFactoryBuilder<?, ?> orikaMapperFactoryBuilder) {
        /** 类构造器的解析器策略. 默认为 SimpleConstructorResolverStrategy **/
        orikaMapperFactoryBuilder.constructorResolverStrategy(UtilityResolver.getDefaultConstructorResolverStrategy());

        /** 编译生成的源码策略. 默认使用JavassistCompilerStrategy. **/
        orikaMapperFactoryBuilder.compilerStrategy(UtilityResolver.getDefaultCompilerStrategy());
        /** 如果要调试动态生成的源码, 使用此编译策略 **/
        // orikaMapperFactoryBuilder.compilerStrategy(new EclipseJdtCompilerStrategy());

        /** 属性解析器. 默认为IntrospectorPropertyResolver, 其他还有(RegexPropertyResolver) **/
        orikaMapperFactoryBuilder.propertyResolverStrategy(UtilityResolver.getDefaultPropertyResolverStrategy());

        /** ClassMapper工厂类 **/
        orikaMapperFactoryBuilder.classMapBuilderFactory(UtilityResolver.getDefaultClassMapBuilderFactory());
    }
}
