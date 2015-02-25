package org.apache.commons.vfs2.provider;

import java.util.concurrent.locks.Lock;

/**
 * Factory for creating different lock strategies for file system - lock operations by file system
 * or lock operation by file.
 *
 */
public interface FileLockStrategyFactory
{
    /**
     * Create new lock for file operations.
     *
     * @return
     */
    Lock createLock();
}
