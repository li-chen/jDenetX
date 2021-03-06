/*
 *    TaskMonitor.java
 *    Copyright (C) 2007 University of Waikato, Hamilton, New Zealand
 *    @author Richard Kirkby (rkirkby@cs.waikato.ac.nz)
 *
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package tr.gov.ulakbim.jDenetX.tasks;

public interface TaskMonitor {

    public void setCurrentActivity(String activityDescription,
                                   double fracComplete);

    public void setCurrentActivityDescription(String activity);

    public void setCurrentActivityFractionComplete(double fracComplete);

    public boolean taskShouldAbort();

    public boolean resultPreviewRequested();

    public void setLatestResultPreview(Object latestPreview);

    public String getCurrentActivityDescription();

    public double getCurrentActivityFractionComplete();

    public void requestPause();

    public void requestResume();

    public void requestCancel();

    public boolean isPaused();

    public boolean isCancelled();

    public void requestResultPreview();

    public void requestResultPreview(ResultPreviewListener toInform);

    public Object getLatestResultPreview();

}
