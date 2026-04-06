package ai.basic.x1.adapter.api.config;

import ai.basic.x1.entity.enums.DatasetTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author fyb
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DatasetInitialInfo {

    /**
     * Dataset name
     */
    private String name;

    /**
     * Dataset type
     */
    private DatasetTypeEnum type;

    /**
     * Compressed package name
     */
    private String fileName;

    /**
     * Upload user name
     */
    private String userName;

    private List<DatasetClassProperties> classes;

    @Data
    public static class DatasetClassProperties{

        private String name;

        private String color;

        private String toolType;

        private String toolTypeOptions;

        private String attributes;
    }

}
