/**
 * Created by kanghonggu on 2017-06-08.
 */
const path = require('path');
const webpack = require('webpack');
module.exports = {
    devtool: 'inline-source-map',

    devServer: {
        historyApiFallback: true,
        publicPath: '/static/dist',
        host: "0.0.0.0",
        port: 3000,
        proxy: {
            "**": "http://localhost:9000",
        }

    },
    plugins: [
        new webpack.NamedModulesPlugin()
    ]
};