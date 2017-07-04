/**
 * Created by kanghonggu on 2017-06-08.
 */
const path = require('path');
const webpack = require('webpack');
module.exports = {
    devtool: 'inline-source-map',

    devServer: {
        historyApiFallback: true,
        publicPath: '/static/js/dist',
        host: "0.0.0.0",
        port: 9000,
        proxy: {
            "**": "http://localhost",
        },
        disableHostCheck: true

    },
    plugins: [
        new webpack.NamedModulesPlugin()
    ]
};