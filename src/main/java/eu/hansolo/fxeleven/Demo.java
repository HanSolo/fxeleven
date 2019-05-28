/*
 * Copyright (c) 2019 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fxeleven;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.GaugeBuilder;
import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.Tile.SkinType;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

import java.net.URL;


/**
 * User: hansolo
 * Date: 2019-02-28
 * Time: 16:12
 */
public class Demo extends Application {
    private Tile  tile;
    private Gauge gauge;

    @Override public void init() {
        tile = TileBuilder.create()
                          .skinType(SkinType.GAUGE)
                          .title("Title")
                          .text("Text")
                          .description("Description")
                          .build();

        gauge = GaugeBuilder.create()
                            .skinType(Gauge.SkinType.GAUGE)
                            .title("Title")
                            .unit("m")
                            .build();
    }

    @Override public void start(Stage stage) {
        URL location = Demo.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());


        VBox pane = new VBox(10, tile, gauge);
        pane.setPadding(new Insets(10));
        pane.getStyleClass().add("demo-pane");

        Scene scene = new Scene(pane);
        //scene.getStylesheets().add("eu/hansolo/fxeleven/demo.css");
        scene.getStylesheets().add(Demo.class.getResource("demo.css").toExternalForm());
        //scene.getStylesheets().add(Demo.class.getResource("eu/hansolo/fxeleven/demo.css").toExternalForm());


        stage.setTitle("TilesFX 11 & Medusa 11");
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    @Override public void stop() {
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
