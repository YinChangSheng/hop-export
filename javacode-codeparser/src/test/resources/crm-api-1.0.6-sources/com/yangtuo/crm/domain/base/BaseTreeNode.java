package com.yangtuo.crm.domain.base;

import java.util.List;

/**
 * 构造树节点的基础类
 *
 * @param <T>
 */
public class BaseTreeNode<T>{

    /**
     * 当前节点详情
     */
    T nodeInfo;

    /**
     * 下级节点列表
     */
    List<? extends BaseTreeNode<T>> childList;

    public T getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(T nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public List<? extends BaseTreeNode<T>> getChildList() {
        return childList;
    }

    public void setChildList(List<? extends BaseTreeNode<T>> childList) {
        this.childList = childList;
    }
}
