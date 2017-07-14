/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package com.github.onepiecex.router.core.route;

import java.util.List;

/**
 * Created by xiong on 2017-07-14.
 */
public interface RouteBuilder extends RouteBuilderWithControllerMethod<RouteBuilder> {

    List<Route> getRoutes();
}
