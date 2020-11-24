var path = require('path');

var node_dir = __dirname + '/node_modules';

var webpack = require('webpack');

module.exports = {
    entry: './src/main/js/client.js',
    devtool: 'source-map',
    cache: true,
    resolve: {
        alias: {
            'stompjs': node_dir + '/stompjs/lib/stomp.js',
            'path': 'path-browserify'
        }
    },
    output: {
        path: __dirname,
        filename: './src/main/resources/static/resources/js/built/bundle.js'
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                loader: 'babel-loader',
                options: {
                    cacheDirectory: true,
                    presets: ['@babel/preset-env', '@babel/preset-react'],
                    plugins: ['@babel/plugin-proposal-object-rest-spread', ['@babel/plugin-proposal-decorators', { "legacy": true }], '@babel/plugin-proposal-class-properties']
                }
            },
            {
                // See https://github.com/webpack/webpack/issues/11467
                test: /\.m?js/,
                resolve: {
                    fullySpecified: false
                }
            }
        ]
    },
    plugins: [
        new webpack.ProvidePlugin({
            Promise: "bluebird"
        })
    ]
};