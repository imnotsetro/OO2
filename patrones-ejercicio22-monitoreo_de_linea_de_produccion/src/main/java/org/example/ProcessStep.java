package org.example;

public abstract class ProcessStep {
    private boolean result;

    public void execute (MixingTank tank){
        if (this.basicExecute(tank)){
            this.setSuccess();
        }
        else this.setFailure();
    }

    abstract boolean basicExecute(MixingTank tank);

    public void setSuccess() {
        this.result = true;
    }

    public void setFailure() {
        this.result = false;
    }

    public boolean isResult() {
        return result;
    }
}
