package com.epam.first.observer;

/**
 * @author Hanna.Hlushakova
 *
 */

import com.epam.first.entity.Cube;

public interface IObserver {
     void objectModified(Cube cube);
}
