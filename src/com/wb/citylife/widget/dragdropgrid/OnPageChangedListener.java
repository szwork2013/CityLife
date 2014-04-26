package com.wb.citylife.widget.dragdropgrid;

public interface OnPageChangedListener {

    /**
     * called when the grid is scrolled to another page
     * @param sender grid
     * @param newPageNumber 0 based
     */
    public void onPageChanged(PagedDragDropGrid sender, int newPageNumber);
}
