package org.n52.kommonitor.importer.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Repository for {@link Converter} implementations
 *
 * @author <a href="mailto:s.drost@52north.org">Sebastian Drost</a>
 */
@Component
public class ConverterRepository {

    @Autowired
    private List<AbstractConverter> converterList;

    /**
     * Retrieve a certain {@link Converter} implementation by its name
     *
     * @param name the name of  a certain {@link Converter} implementation
     * @return an {@link Optional} describing the found {@link Converter} implementation
     */
    public Optional<AbstractConverter> getConverter(String name) {
        Optional<AbstractConverter> converterOpt = this.converterList.stream()
                .filter(i -> i.getName().equals(name))
                .findFirst();
        return converterOpt;
    }

    /**
     * Retrieve a list of all registered {@link Converter} implementations
     *
     * @return a list of all registered {@link Converter} implementations
     */
    public List<AbstractConverter> getAll() {
        return Collections.unmodifiableList(this.converterList);
    }
}
