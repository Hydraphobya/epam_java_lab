package com.epam.first.observer;

/**
 * @author Hanna.Hlushakova
 *
 */

import com.epam.first.entity.CubeDimensions;

public interface IObservableSubject {
	public void attachObserver(CubeDimensions cubeDimensions);
	public void detachObserver(CubeDimensions cubeDimensions);
	public void notifyObservers();
}
