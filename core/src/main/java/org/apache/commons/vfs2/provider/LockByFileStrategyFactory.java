package org.apache.commons.vfs2.provider;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock operations with file only on file instance - useful for stateless file systems
 *
 */
public class LockByFileStrategyFactory implements FileLockStrategyFactory
{
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public Lock createLock()
    {
        return lock;
    }
}
