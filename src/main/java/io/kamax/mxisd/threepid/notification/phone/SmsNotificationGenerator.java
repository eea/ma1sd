/*
 * mxisd - Matrix Identity Server Daemon
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.mxisd.threepid.notification.phone;

import io.kamax.mxisd.config.MatrixConfig;
import io.kamax.mxisd.config.ServerConfig;
import io.kamax.mxisd.config.threepid.medium.PhoneSmsTemplateConfig;
import io.kamax.mxisd.threepid.notification.GenericTemplateNotificationGenerator;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationGenerator extends GenericTemplateNotificationGenerator implements IPhoneNotificationGenerator {

    public SmsNotificationGenerator(MatrixConfig mxCfg, ServerConfig srvCfg, PhoneSmsTemplateConfig cfg) {
        super(mxCfg, srvCfg, cfg);
    }

    @Override
    public String getId() {
        return "template";
    }

}
