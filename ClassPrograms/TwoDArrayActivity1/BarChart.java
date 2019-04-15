//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BarChart {
    public static final int XMAX = 400;
    public static final int XSTART = 60;
    public static final int[] YMAX = new int[]{120, 220, 320, 420};
    private ArrayList<MethodState> methodStates;
    private int currentIndex = 0;
    private Color[] colors;
    private int[][] data;
    private int barSize;
    private int xStart;
    private int activity;
    private int count;
    private int studentResult;
    private int resultValue;
    private int exactFrequencyCount;
    private int exactMinimum;
    private int key;
    private int rowSelected;
    private boolean checkNewValues;

    public BarChart() {
        this.colors = new Color[]{Color.NAVY, Color.rgb(150, 150, 0), Color.DARKGRAY, Color.MAGENTA};
        this.activity = 5;
        this.count = 0;
    }

    public BarChart(int[][] dArray) {
        this.colors = new Color[]{Color.NAVY, Color.rgb(150, 150, 0), Color.DARKGRAY, Color.MAGENTA};
        this.activity = 5;
        this.count = 0;
        this.methodStates = new ArrayList();
        this.data = new int[dArray.length][dArray[0].length];

        for(int i = 0; i < dArray.length; ++i) {
            for(int j = 0; j < dArray[i].length; ++j) {
                this.data[i][j] = dArray[i][j];
            }
        }

        this.barSize = 380 / this.data[0].length;
        this.studentResult = -1;
        this.exactFrequencyCount = -1;
        this.exactMinimum = -1;
        this.key = -1;
        this.checkNewValues = true;
    }

    public void setData(int[][] newData) {
        this.data = newData;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setRowSelected(int rowSelected) {
        this.rowSelected = rowSelected;
    }

    public void setResultValue(int resultValue) {
        this.resultValue = resultValue;
    }

    public void draw(GraphicsContext gc) {
        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                gc.fillRect((double)this.xStart, (double)(YMAX[i] - this.data[i][j]), (double)(this.barSize - 5), (double)this.data[i][j]);
                gc.fillText(this.data[i][j].makeConcatWithConstants<invokedynamic>(this.data[i][j]), (double)this.xStart, (double)(YMAX[i] + 15));
                this.xStart += this.barSize;
            }
        }

    }

    public void drawArray(GraphicsContext gc) {
        gc.clearRect(0.0D, 0.0D, 500.0D, 550.0D);
        MethodState ms = (MethodState)this.methodStates.get(this.currentIndex);
        int indexI = ms.getI();
        int indexJ = ms.getJ();
        gc.setFill(Color.NAVY);

        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                if (i == indexI && j == indexJ) {
                    gc.setFill(Color.RED);
                }

                gc.fillRect((double)this.xStart, (double)(YMAX[i] - this.data[i][j]), (double)(this.barSize - 5), (double)this.data[i][j]);
                gc.fillText(this.data[i][j].makeConcatWithConstants<invokedynamic>(this.data[i][j]), (double)this.xStart, (double)(YMAX[i] + 15));
                this.xStart += this.barSize;
                gc.setFill(this.colors[i]);
            }
        }

    }

    public void drawNewArray(GraphicsContext gc) {
        gc.clearRect(0.0D, 0.0D, 500.0D, 550.0D);
        MethodState ms = (MethodState)this.methodStates.get(this.currentIndex);
        int indexI = ms.getI();
        int indexJ = ms.getJ();
        gc.setFill(Color.NAVY);

        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                int storedData = ms.getData(i, j);
                if (i == indexI && j == indexJ) {
                    gc.setFill(Color.RED);
                }

                gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                this.xStart += this.barSize;
                gc.setFill(Color.NAVY);
                gc.setFill(this.colors[i]);
            }
        }

    }

    public void drawNewValue(GraphicsContext gc) {
        gc.clearRect(0.0D, 0.0D, 500.0D, 550.0D);
        MethodState ms = (MethodState)this.methodStates.get(this.currentIndex);
        int indexI = ms.getI();
        int indexJ = ms.getJ();
        gc.setFill(Color.NAVY);

        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                int storedData = ms.getData(i, j);
                if (i == indexI && j == indexJ) {
                    gc.setFill(Color.RED);
                }

                gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                this.xStart += this.barSize;
                gc.setFill(Color.NAVY);
                gc.setFill(this.colors[i]);
            }
        }

    }

    public void drawCountValue(GraphicsContext gc) {
        gc.clearRect(0.0D, 0.0D, 500.0D, 550.0D);
        MethodState ms = (MethodState)this.methodStates.get(this.currentIndex);
        int indexI = ms.getI();
        int indexJ = ms.getJ();
        int count = ms.getValue();
        String status = "current";
        if (this.currentIndex == this.methodStates.size() - 1) {
            count = this.resultValue;
            status = "final";
        }

        Font mediumFont = new Font(18.0D);
        gc.setFont(mediumFont);
        gc.setFill(Color.NAVY);
        gc.fillText("Your " + status + " frequency count for " + this.key + ": " + count, 25.0D, (double)(YMAX[0] / 4));
        Font smallFont = new Font(12.0D);
        gc.setFont(smallFont);
        int runningIndex = -1;
        gc.setStroke(Color.RED);

        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                ++runningIndex;
                int storedData = ms.getData(i, j);
                if (this.key == storedData && this.currentIndex >= runningIndex) {
                    gc.setFill(Color.RED);
                    gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                } else {
                    gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                }

                if (i == indexI && j == indexJ) {
                    gc.strokeRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                }

                gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                this.xStart += this.barSize;
                gc.setFill(this.colors[i]);
            }
        }

    }

    public void drawMinimum(GraphicsContext gc) {
        gc.clearRect(0.0D, 0.0D, 500.0D, 550.0D);
        MethodState ms = (MethodState)this.methodStates.get(this.currentIndex);
        int indexI = ms.getI();
        int indexJ = ms.getJ();
        int min = ms.getValue();
        String status = "current";
        if (this.currentIndex == this.methodStates.size() - 1) {
            min = this.resultValue;
            status = "final";
        }

        Font mediumFont = new Font(18.0D);
        gc.setFont(mediumFont);
        gc.setFill(Color.NAVY);
        gc.fillText("Your " + status + " minimum in column " + this.key + ": " + min, 25.0D, (double)(YMAX[0] / 4));
        Font smallFont = new Font(12.0D);
        gc.setFont(smallFont);

        for(int i = 0; i < this.data.length; ++i) {
            this.xStart = 60;
            gc.setFill(this.colors[i]);
            gc.fillText("Row " + i, (double)(this.xStart - 50), (double)YMAX[i]);

            for(int j = 0; j < this.data[i].length; ++j) {
                int storedData = ms.getData(i, j);
                gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                if (i == indexI && j == this.key) {
                    gc.setStroke(Color.RED);
                    gc.strokeRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                    gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                }

                if (this.data[i][j] == min && j == this.key && i <= indexI) {
                    gc.setFill(Color.RED);
                    gc.fillRect((double)this.xStart, (double)(YMAX[i] - storedData), (double)(this.barSize - 5), (double)storedData);
                    gc.fillText(storedData.makeConcatWithConstants<invokedynamic>(storedData), (double)this.xStart, (double)(YMAX[i] + 15));
                }

                this.xStart += this.barSize;
                gc.setFill(this.colors[i]);
            }
        }

    }

    public void addMethodState(MethodState ms) {
        this.methodStates.add(ms);
    }

    public void incrementCurrentIndex() {
        ++this.currentIndex;
    }

    public boolean checkCurrentIndex() {
        return this.currentIndex < this.methodStates.size();
    }

    public void resetCurrentIndex() {
        this.currentIndex = 0;
    }

    public void clearMS() {
        this.methodStates.clear();
    }
}